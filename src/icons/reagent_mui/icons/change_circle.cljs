(ns reagent-mui.icons.change-circle
  "Imports @mui/icons-material/ChangeCircle as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def change-circle (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm.06 17v-2.01H12c-1.28 0-2.56-.49-3.54-1.46-1.71-1.71-1.92-4.35-.64-6.29l1.1 1.1c-.71 1.33-.53 3.01.59 4.13.7.7 1.62 1.03 2.54 1.01v-2.14l2.83 2.83L12.06 19zm4.11-4.24-1.1-1.1c.71-1.33.53-3.01-.59-4.13C13.79 8.84 12.9 8.5 12 8.5h-.06v2.15L9.11 7.83 11.94 5v2.02c1.3-.02 2.61.45 3.6 1.45 1.7 1.7 1.91 4.35.63 6.29z"})
                                    "ChangeCircle"))
