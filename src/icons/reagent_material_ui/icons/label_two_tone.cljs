(ns reagent-material-ui.icons.label-two-tone
  "Imports @material-ui/icons/LabelTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def label-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16 7H5v10h11l3.55-5z", "opacity" ".3"}) (e "path" #js {"d" "M17.63 5.84C17.27 5.33 16.67 5 16 5L5 5.01C3.9 5.01 3 5.9 3 7v10c0 1.1.9 1.99 2 1.99L16 19c.67 0 1.27-.33 1.63-.84L22 12l-4.37-6.16zM16 17H5V7h11l3.55 5L16 17z"}))
                                     "LabelTwoTone"))
