(ns reagent-material-ui.icons.maps-ugc-rounded
  "Imports @material-ui/icons/MapsUgcRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def maps-ugc-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12c0 1.54.36 2.98.97 4.29l-1.46 4.96c-.22.75.49 1.46 1.25 1.23l4.96-1.46c1.66.79 3.56 1.15 5.58.89 4.56-.59 8.21-4.35 8.66-8.92C22.53 7.03 17.85 2 12 2zm3 11h-2v2c0 .55-.45 1-1 1s-1-.45-1-1v-2H9c-.55 0-1-.45-1-1s.45-1 1-1h2V9c0-.55.45-1 1-1s1 .45 1 1v2h2c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                       "MapsUgcRounded"))
