(ns reagent-material-ui.icons.local-laundry-service-two-tone
  "Imports @material-ui/icons/LocalLaundryServiceTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-laundry-service-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5.99 4L6 20h12V4H5.99c.01 0 0 0 0 0zM11 5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zM8 5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm4 4c2.76 0 5 2.24 5 5s-2.24 5-5 5-5-2.24-5-5 2.24-5 5-5z", "opacity" ".3"}) (e "path" #js {"d" "M18 2.01L6 2c-1.11 0-2 .89-2 2v16c0 1.11.89 2 2 2h12c1.11 0 2-.89 2-2V4c0-1.11-.89-1.99-2-1.99zM18 20H6L5.99 4H18v16z"}) (e "circle" #js {"cy" "6", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "6", "r" "1", "cx" "11"}) (e "path" #js {"d" "M12 19c2.76 0 5-2.24 5-5s-2.24-5-5-5-5 2.24-5 5 2.24 5 5 5zm2.36-7.36c1.3 1.3 1.3 3.42 0 4.72-1.3 1.3-3.42 1.3-4.72 0l4.72-4.72z"}))
                                                     "LocalLaundryServiceTwoTone"))
