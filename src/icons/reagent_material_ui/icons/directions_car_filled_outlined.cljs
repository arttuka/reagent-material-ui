(ns reagent-material-ui.icons.directions-car-filled-outlined
  "Imports @material-ui/icons/DirectionsCarFilledOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def directions-car-filled-outlined (create-svg-icon [(e "path" #js {"d" "M18.92 6.01C18.72 5.42 18.16 5 17.5 5h-11c-.66 0-1.21.42-1.42 1.01L3 12v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-8l-2.08-5.99zM6.85 7h10.29l1.04 3H5.81l1.04-3zM19 17H5v-5h14v5z"}) (e "circle" #js {"cx" "7.5", "cy" "14.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "14.5", "r" "1.5"})]
                                                     "DirectionsCarFilledOutlined"))
