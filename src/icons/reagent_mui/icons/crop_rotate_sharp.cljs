(ns reagent-mui.icons.crop-rotate-sharp
  "Imports @mui/icons-material/CropRotateSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-rotate-sharp (create-svg-icon (e "path" #js {"d" "M7.47 21.49C4.2 19.93 1.86 16.76 1.5 13H0c.51 6.16 5.66 11 11.95 11 .23 0 .44-.02.66-.03L8.8 20.15l-1.33 1.34zM12.05 0c-.23 0-.44.02-.66.04l3.81 3.81 1.33-1.33C19.8 4.07 22.14 7.24 22.5 11H24c-.51-6.16-5.66-11-11.95-11zM16 14h2V6h-8v2h6v6zm-8 2V4H6v2H4v2h2v10h10v2h2v-2h2v-2H8z"})
                                        "CropRotateSharp"))
