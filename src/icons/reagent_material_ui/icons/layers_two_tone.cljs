(ns reagent-material-ui.icons.layers-two-tone
  "Imports @material-ui/icons/LayersTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def layers-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6.26 9L12 13.47 17.74 9 12 4.53z", "opacity" ".3"}) (e "path" #js {"d" "M19.37 12.8l-7.38 5.74-7.37-5.73L3 14.07l9 7 9-7zM12 2L3 9l1.63 1.27L12 16l7.36-5.73L21 9l-9-7zm0 11.47L6.26 9 12 4.53 17.74 9 12 13.47z"}))
                                      "LayersTwoTone"))
