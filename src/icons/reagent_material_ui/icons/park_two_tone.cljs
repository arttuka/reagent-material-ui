(ns reagent-material-ui.icons.park-two-tone
  "Imports @material-ui/icons/ParkTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def park-two-tone (create-svg-icon [(e "path" #js {"d" "M13.26 10h1.9l-3.15-4.5L8.88 10h1.81l-3.9 6h10.47z", "opacity" ".3"}) (e "path" #js {"d" "M17 12h2L12 2 5.05 12H7l-3.9 6h6.92v4h3.95v-4H21l-4-6zM6.79 16l3.9-6H8.88l3.13-4.5 3.15 4.5h-1.9l4 6H6.79z"})]
                                    "ParkTwoTone"))
