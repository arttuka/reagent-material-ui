(ns reagent-mui.icons.star-purple-500-sharp
  "Imports @mui/icons-material/StarPurple500Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def star-purple-500-sharp (create-svg-icon (e "path" #js {"d" "M12 17.27 18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21 12 17.27z"})
                                            "StarPurple500Sharp"))
