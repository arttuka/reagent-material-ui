(ns reagent-material-ui.icons.directions-bus-rounded
  "Imports @material-ui/icons/DirectionsBusRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def directions-bus-rounded (create-svg-icon (e "path" #js {"d" "M12 2c-4 0-8 .5-8 4v9.5c0 .95.38 1.81 1 2.44v1.56c0 .83.67 1.5 1.5 1.5S8 20.33 8 19.5V19h8v.5c0 .82.67 1.5 1.5 1.5.82 0 1.5-.67 1.5-1.5v-1.56c.62-.63 1-1.49 1-2.44V6c0-3.5-3.58-4-8-4zM8.5 16c-.83 0-1.5-.67-1.5-1.5S7.67 13 8.5 13s1.5.67 1.5 1.5S9.33 16 8.5 16zm7 0c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zm2.5-6H6V7h12v3z"})
                                             "DirectionsBusRounded"))
