(ns reagent-mui.icons.format-color-text-two-tone
  "Imports @mui/icons-material/FormatColorTextTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-color-text-two-tone (create-svg-icon (e "path" #js {"d" "M2 20h20v4H2v-4zm3.49-3h2.42l1.27-3.58h5.65L16.09 17h2.42L13.25 3h-2.5L5.49 17zm4.42-5.61 2.03-5.79h.12l2.03 5.79H9.91z"})
                                                 "FormatColorTextTwoTone"))
