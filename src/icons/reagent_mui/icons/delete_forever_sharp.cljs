(ns reagent-mui.icons.delete-forever-sharp
  "Imports @mui/icons-material/DeleteForeverSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def delete-forever-sharp (create-svg-icon (e "path" #js {"d" "M6 21h12V7H6v14zm2.46-9.12 1.41-1.41L12 12.59l2.12-2.12 1.41 1.41L13.41 14l2.12 2.12-1.41 1.41L12 15.41l-2.12 2.12-1.41-1.41L10.59 14l-2.13-2.12zM15.5 4l-1-1h-5l-1 1H5v2h14V4h-3.5z"})
                                           "DeleteForeverSharp"))
