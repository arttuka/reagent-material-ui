(ns reagent-mui.icons.sixty-fps-select-sharp
  "Imports @mui/icons-material/SixtyFpsSelectSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sixty-fps-select-sharp (create-svg-icon (e "path" #js {"d" "M18 6v6h-3V6h3zm2-2h-7v10h7V4zm-9 2V4H4v10h7V8H6V6h5zm-2 4v2H6v-2h3zM5 22H3v-5h2v5zm4 0H7v-5h2v5zm4 0h-2v-5h2v5zm8 0h-6v-5h6v5z"})
                                             "SixtyFpsSelectSharp"))
