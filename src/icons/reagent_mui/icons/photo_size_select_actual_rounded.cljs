(ns reagent-mui.icons.photo-size-select-actual-rounded
  "Imports @mui/icons-material/PhotoSizeSelectActualRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-size-select-actual-rounded (create-svg-icon (e "path" #js {"d" "M21 3H3C2 3 1 4 1 5v14c0 1.1.9 2 2 2h18c1 0 2-1 2-2V5c0-1-1-2-2-2zM5.63 16.19l2.49-3.2c.2-.25.58-.26.78-.01l2.1 2.53 3.1-3.99c.2-.26.6-.26.8.01l3.51 4.68c.25.33.01.8-.4.8H6.02c-.41-.01-.65-.49-.39-.82z"})
                                                       "PhotoSizeSelectActualRounded"))
