(ns reagent-material-ui.icons.format-color-fill-two-tone
  "Imports @material-ui/icons/FormatColorFillTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-color-fill-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10 5.21L5.21 10h9.58z", "opacity" ".3"}) (e "path" #js {"d" "M19 17c1.1 0 2-.9 2-2 0-1.33-2-3.5-2-3.5s-2 2.17-2 3.5c0 1.1.9 2 2 2zm-10.06-.44c.29.29.68.44 1.06.44s.77-.15 1.06-.44l5.5-5.5c.59-.58.59-1.53 0-2.12L7.62 0 6.21 1.41l2.38 2.38-5.15 5.15c-.59.59-.59 1.54 0 2.12l5.5 5.5zM10 5.21L14.79 10H5.21L10 5.21z"}) (e "path" #js {"d" "M0 20h24v4H0z", "fillOpacity" ".36"}))
                                                 "FormatColorFillTwoTone"))
