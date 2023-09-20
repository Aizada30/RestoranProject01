package global.service;

import global.dto.request.MenuRequest;
import global.dto.response.MenuResponse;
import global.dto.response.SimpleResponse;

import java.util.List;

/**
 * Abdyrazakova Aizada
 */
public interface MenuService {

    SimpleResponse saveMenu(Long restaurantId, MenuRequest menuRequest);
    List<MenuResponse> getAll();
    MenuResponse getById(Long menuId);
    SimpleResponse deleteMenu(Long menuId);
    SimpleResponse updateMenu(Long menuId , MenuRequest menuRequest);


}
