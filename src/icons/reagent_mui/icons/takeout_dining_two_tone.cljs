(ns reagent-mui.icons.takeout-dining-two-tone
  "Imports @mui/icons-material/TakeoutDiningTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def takeout-dining-two-tone (create-svg-icon [(e "path" #js {"d" "m9.83 5-2.8 2.73L7.12 9h9.75l.09-1.27L14.16 5zM7.79 18h8.44l.51-7H7.28z", "opacity" ".3"}) (e "path" #js {"d" "M20.59 6.05 19 7.63l.03-.56L14.98 3H9.02L4.97 7.07l.03.5-1.59-1.56L2 7.44l3.23 3.11.7 9.45h12.14l.7-9.44L22 7.46l-1.41-1.41zM16.23 18H7.79l-.51-7h9.46l-.51 7zm.64-9H7.12l-.09-1.27L9.83 5h4.33l2.8 2.73L16.87 9z"})]
                                              "TakeoutDiningTwoTone"))
