(ns reagent-material-ui.icons.six-k-plus-sharp
  "Imports @material-ui/icons/SixKPlusSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def six-k-plus-sharp (create-svg-icon (e "path" #js {"d" "M7.5 12.5h1V14h-1v-1.5zM21 3H3v18h18V3zm-11 7.5H7.5v1H10V15H6V9h4v1.5zm6 4.5h-1.75l-1.75-2.25V15H11V9h1.5v2.25L14.25 9H16l-2.25 3L16 15zm3-2.5h-1.5V14h-1v-1.5H15v-1h1.5V10h1v1.5H19v1z"})
                                       "SixKPlusSharp"))
