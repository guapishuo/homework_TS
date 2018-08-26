package web;

import dao.CarDao;
import dao.CarIn;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/update")
public class CarUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        CarDao carDao = new CarIn();
        Car car = carDao.getCarById(id);
        req.setAttribute("car", car);
        req.getRequestDispatcher("jsp/CarUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String brand = req.getParameter("brand");
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));

        Car car = new Car(id,brand,name,price);

        CarDao carDao = new CarIn();
        carDao.update(car);

        HttpSession session = req.getSession();
        session.setAttribute("msg", "更新成功！");

        resp.sendRedirect("/detail?id=" + id);
    }
}
