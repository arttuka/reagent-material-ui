(ns reagent-mui.icons.wysiwyg-sharp
  "Imports @mui/icons-material/WysiwygSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wysiwyg-sharp (create-svg-icon (e "path" #js {"d" "M17 12H7v-2h10v2zm-4 2H7v2h6v-2zm8 7H3V3h18v18zM19 7H5v12h14V7z"})
                                    "WysiwygSharp"))
