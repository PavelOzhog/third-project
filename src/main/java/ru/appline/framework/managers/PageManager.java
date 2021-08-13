package ru.appline.framework.managers;

import ru.ibs.appline.pages.ProductPageGameDetroyt;
import ru.ibs.appline.pages.ProductPageMonitor;
import ru.ibs.appline.pages.StartPage;
import ru.ibs.appline.pages.blockPages.MainSearchBlock;
import ru.ibs.appline.pages.blockPages.SelectProductBlock;
import ru.ibs.appline.pages.blockPages.ShopBusket;

public class PageManager {
    private static PageManager INSTANCE = null;

    private StartPage startPage;
    private MainSearchBlock mainSearch;
    private ProductPageMonitor prodPageMon;
    private ProductPageGameDetroyt gameDetroyt;
    private ShopBusket shopBusket;
    private SelectProductBlock productBlock;

    private PageManager() {

    }


    public static PageManager getPageManager() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }



    public StartPage getStartPage() {
        if(startPage==null){
            startPage= new StartPage();
        }
        return startPage;
    }

    public MainSearchBlock getMainSearch() {
        if(mainSearch==null){
            mainSearch= new MainSearchBlock();
        }
        return mainSearch;
    }



    public ProductPageMonitor getProdPageMon() {
        if(prodPageMon==null){
            prodPageMon= new ProductPageMonitor();
        }
        return prodPageMon;
    }

    public ProductPageGameDetroyt getGameDetroyt() {
        if(gameDetroyt==null){
            gameDetroyt= new ProductPageGameDetroyt();
        }
        return gameDetroyt;
    }

    public ShopBusket getShopBusket() {
        if(shopBusket==null){
            shopBusket= new ShopBusket();
        }
        return shopBusket;
    }

    public SelectProductBlock getProductBlock() {
        if (productBlock == null) {
            productBlock = new SelectProductBlock();
        }
        return productBlock;
    }
}
