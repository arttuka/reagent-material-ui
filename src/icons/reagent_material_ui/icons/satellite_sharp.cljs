(ns reagent-material-ui.icons.satellite-sharp
  "Imports @material-ui/icons/SatelliteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def satellite-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM5 4.99h3C8 6.65 6.66 8 5 8V4.99zM5 12v-2c2.76 0 5-2.25 5-5.01h2C12 8.86 8.87 12 5 12zm0 6 3.5-4.5 2.5 3.01L14.5 12l4.5 6H5z"})
                                      "SatelliteSharp"))
