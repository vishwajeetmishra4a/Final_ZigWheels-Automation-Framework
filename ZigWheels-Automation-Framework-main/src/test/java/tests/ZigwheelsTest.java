package tests;

import java.util.List;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;
import utils.ScreenshotUtil;

public class ZigwheelsTest extends BaseTest {

    // LOGIN FIRST
    @Test(priority = 1, enabled = true)
    public void testGoogleLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.googleLoginValidation();

        System.out.println("Google Login Test Completed");
    }

    // UPCOMING HONDA BIKES
    @Test(priority = 2, enabled = true)
    public void testUpcomingHondaBikes() {

        BikesPage bikesPage = new BikesPage(driver);

        bikesPage.goToUpcomingBikes();
        bikesPage.selectHondaManufacturer();
        bikesPage.getHondaBikesUnder4L();

        ScreenshotUtil.capture(driver, "Honda_Bikes");
    }

    // ELECTRIC CARS
    @Test(priority = 3, enabled = true)
    public void testElectricCars() {

        ElectricCarsPage page = new ElectricCarsPage(driver);

        page.goToElectricCars();
        page.openFirstCar();
        page.printCarDetails();

        ScreenshotUtil.capture(driver, "ElectricCar");
    }

    // USER REVIEWS
    @Test(priority = 4, enabled = true)
    public void testUserReviews() {

        ReviewPage reviewPage = new ReviewPage(driver);

        reviewPage.goToUserReviews();
        List<String> reviews = reviewPage.getReviewsInDescendingOrder();
        reviewPage.printCleanReviews(reviews);

        ScreenshotUtil.capture(driver, "Reviews");
    }

    // ✅ 5. BROWSE BY BRAND
    @Test(priority = 5, enabled = true)
    public void testBrowseByBrand() throws Exception {

        BrandPage page = new BrandPage(driver);

        page.scrollToBrowseSection();
        page.clickBrandTab();
        page.selectBMW();
        page.clickCruiserBikes();

        ScreenshotUtil.capture(driver, "BMW_Cruiser");
        System.out.println("BMW Cruiser Bikes Selected");
    }

    // CAR FILTERS
    @Test(priority = 6, enabled = true)
    public void testCarFilters() {

        CarFilterPage page = new CarFilterPage(driver);

        page.scrollToCarsSection();
        page.clickSeatingCapacityTab();
        page.selectNineSeater();
        page.clickEngineDisplacement();
        page.select3000Plus();
        page.clickPriceTab();
        page.openFirstCar();

        ScreenshotUtil.capture(driver, "FilterCars");
        System.out.println("Filters applied successfully");
    }

    // ELECTRIC BIKES 
    @Test(priority = 7 ,enabled = true)
    public void testMorePage() {

        ElectricBikes electricPage = new ElectricBikes(driver);

        electricPage.gotoPage();
        electricPage.searchEVBike();
        electricPage.openFirstEBike();
        electricPage.printingEBikeDetails();

        ScreenshotUtil.capture(driver, "ElectricBike");
    }
}
