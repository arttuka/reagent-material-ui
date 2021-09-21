(ns reagent-mui.icons.bedroom-parent-sharp
  "Imports @mui/icons-material/BedroomParentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bedroom-parent-sharp (create-svg-icon [(e "path" #js {"d" "M6.5 12h11v2h-11zm.75-3.5h4v2h-4zm5.5 0h4v2h-4z"}) (e "path" #js {"d" "M22 2H2v20h20V2zm-3 15h-1.5v-1.5h-11V17H5v-5l.65-.55V7H11c.37 0 .72.12 1 .32.28-.2.63-.32 1-.32h5.35v4.45L19 12v5z"})]
                                           "BedroomParentSharp"))
