(ns reagent-mui.icons.bookmark-remove-sharp
  "Imports @mui/icons-material/BookmarkRemoveSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmark-remove-sharp (create-svg-icon (e "path" #js {"d" "M21 7h-6V5h6v2zm-2 3.9c-.64.13-1.32.14-2.02 0-1.91-.38-3.47-1.92-3.87-3.83-.32-1.53.07-2.97.89-4.07H5v18l7-3 7 3V10.9z"})
                                            "BookmarkRemoveSharp"))
