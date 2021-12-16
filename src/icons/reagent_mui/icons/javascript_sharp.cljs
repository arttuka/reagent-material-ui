(ns reagent-mui.icons.javascript-sharp
  "Imports @mui/icons-material/JavascriptSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def javascript-sharp (create-svg-icon (e "path" #js {"d" "M12 15v-2h1.5v.5h2v-1H12V9h5v2h-1.5v-.5h-2v1H17V15h-5zM9 9v4.5H7.5v-1H6V15h4.5V9H9z"})
                                       "JavascriptSharp"))
