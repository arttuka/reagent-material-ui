(ns reagent-material-ui.icons.light-two-tone
  "Imports @material-ui/icons/LightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def light-two-tone (create-svg-icon [(e "path" #js {"d" "M10 17c0 1.1.9 2 2 2s2-.9 2-2h-4z", "opacity" ".3"}) (e "path" #js {"d" "M13 6.06V3h-2v3.06c-4.5.5-8 4.31-8 8.93C3 16.1 3.9 17 5.01 17H8c0 2.21 1.79 4 4 4s4-1.79 4-4h2.99c1.11 0 2.01-.9 2.01-2.01 0-4.62-3.5-8.43-8-8.93zM12 19c-1.1 0-2-.9-2-2h4c0 1.1-.9 2-2 2zm0-4H5c0-3.86 3.14-7 7-7s7 3.14 7 7h-7z"})]
                                     "LightTwoTone"))
