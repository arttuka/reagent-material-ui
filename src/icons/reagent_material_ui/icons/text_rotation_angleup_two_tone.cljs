(ns reagent-material-ui.icons.text-rotation-angleup-two-tone
  "Imports @material-ui/icons/TextRotationAngleupTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def text-rotation-angleup-two-tone (create-svg-icon (e "path" #js {"d" "M16.76 9l1.41 1.41-9.19 9.19 1.41 1.41 9.19-9.19L21 13.24V9h-4.24zm-8.28 3.75l3.54-3.54 2.19.92 1.48-1.48L4.56 4.23 3.5 5.29l4.42 11.14 1.48-1.48-.92-2.2zm-.82-1.72L5.43 6.16l4.87 2.23-2.64 2.64z"})
                                                     "TextRotationAngleupTwoTone"))
