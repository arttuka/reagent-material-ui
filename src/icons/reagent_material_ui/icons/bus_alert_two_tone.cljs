(ns reagent-material-ui.icons.bus-alert-two-tone
  "Imports @material-ui/icons/BusAlertTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bus-alert-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 16c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2v-3H4v3zm9.5-2c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm-7 0c.83 0 1.5.67 1.5 1.5S7.33 17 6.5 17 5 16.33 5 15.5 5.67 14 6.5 14zM4.43 6H11c0-.33.03-.66.08-.98-3.68-.11-5.83.27-6.65.98z", "opacity" ".3"}) (e "path" #js {"d" "M4 11V8h7.29C11.1 7.37 11 6.7 11 6H4.43c.83-.71 2.98-1.09 6.65-.98.1-.7.3-1.37.59-1.99C2.97 2.67 2 5.02 2 7v9.5c0 .95.38 1.81 1 2.44V21c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h8v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-2.06c.62-.63 1-1.49 1-2.44V13c-1.91 0-3.63-.76-4.89-2H4zm12 5c0 1.1-.9 2-2 2H6c-1.1 0-2-.9-2-2v-3h12v3z"}) (e "circle" #js {"cy" "15.5", "r" "1.5", "cx" "6.5"}) (e "circle" #js {"cy" "15.5", "r" "1.5", "cx" "13.5"}) (e "path" #js {"d" "M18 1c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm.5 8h-1V8h1v1zm0-2h-1V3h1v4z"}))
                                         "BusAlertTwoTone"))
