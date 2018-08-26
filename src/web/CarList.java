package web;

import dao.CarDao;
import dao.CarIn;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CarList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDao CarDAO = new CarIn();
        List<Car> cars = CarDAO.listAll();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("jsp/CarList.jsp").forward(req,resp);
    }
}
