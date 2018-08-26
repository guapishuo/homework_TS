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

@WebServlet(value = "/detail")
public class CarDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        CarDao carDao = new CarIn();

        req.getSession().setAttribute("aaa", "222");

        req.getSession().getAttribute("aaa");

        Car car = carDao.getCarById(id);
        req.setAttribute("car", car);
        req.getRequestDispatcher("/jsp/CarDetail.jsp").forward(req, resp);
    }
}


