(ns reagent-mui.icons.man-3
  "Imports @mui/icons-material/Man3 as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-3 (create-svg-icon (e "path" #js {"d" "M14 7h-4c-1.1 0-2 .9-2 2v6h2v7h4v-7h2V9c0-1.1-.9-2-2-2zm-2.0001-5.2487L14.2485 4l-2.2486 2.2486L9.7513 4z"})
                            "Man3"))
