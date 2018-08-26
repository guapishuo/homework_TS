package web;

import dao.CarDao;
import dao.CarIn;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add")
public class CarAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/CarAdd.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String brand = req.getParameter("brand");
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));



        Car car = new Car(id,brand,name, price);

        CarDao carDao = new CarIn();
        carDao.add(car);

        resp.sendRedirect("/index");
    }
}