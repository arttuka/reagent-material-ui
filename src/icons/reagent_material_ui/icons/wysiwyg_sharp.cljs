(ns reagent-material-ui.icons.wysiwyg-sharp
  "Imports @material-ui/icons/WysiwygSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wysiwyg-sharp (create-svg-icon (e "path" #js {"d" "M17 12H7v-2h10v2zm-4 2H7v2h6v-2zm8 7H3V3h18v18zM19 7H5v12h14V7z"})
                                    "WysiwygSharp"))
