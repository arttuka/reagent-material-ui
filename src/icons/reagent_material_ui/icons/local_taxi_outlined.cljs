(ns reagent-material-ui.icons.local-taxi-outlined
  "Imports @material-ui/icons/LocalTaxiOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-taxi-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18.92 6.01C18.72 5.42 18.16 5 17.5 5H15V3H9v2H6.5c-.66 0-1.21.42-1.42 1.01L3 12v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-8l-2.08-5.99zM6.85 7h10.29l1.04 3H5.81l1.04-3zM19 17H5v-4.66l.12-.34h13.77l.11.34V17z"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "7.5"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "16.5"}))
                                          "LocalTaxiOutlined"))
