(ns reagent-mui.icons.explicit-sharp
  "Imports @mui/icons-material/ExplicitSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def explicit-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-6 6h-4v2h4v2h-4v2h4v2H9V7h6v2z"})
                                     "ExplicitSharp"))
