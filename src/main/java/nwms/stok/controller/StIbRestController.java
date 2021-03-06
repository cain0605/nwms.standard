package nwms.stok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nwms.stok.domain.StIb;
import nwms.stok.repository.StIbDao;


@RestController
public class StIbRestController {

	@Autowired
	private StIbDao stIbDao;

	@GetMapping("/stok/ib")
	public List<StIb> findAll(Model model) {

		List<StIb> resultList = stIbDao.findAll();

		return resultList;
	}
}