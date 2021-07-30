(ns reagent-material-ui.icons.view-column-two-tone
  "Imports @material-ui/icons/ViewColumnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-column-two-tone (create-svg-icon [(e "path" #js {"d" "M8.33 17H5V7h3.33v10zm5.34 0h-3.33V7h3.33v10zM19 17h-3.33V7H19v10z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14h18V5H3zm5.33 12H5V7h3.33v10zm5.34 0h-3.33V7h3.33v10zM19 17h-3.33V7H19v10z"})]
                                           "ViewColumnTwoTone"))
