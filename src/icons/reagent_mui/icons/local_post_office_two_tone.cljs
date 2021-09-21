(ns reagent-mui.icons.local-post-office-two-tone
  "Imports @mui/icons-material/LocalPostOfficeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-post-office-two-tone (create-svg-icon [(e "path" #js {"d" "m12 11 8-5H4zM4 8v10h16V8l-8 5z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V8l8 5 8-5v10zm-8-7L4 6h16l-8 5z"})]
                                                 "LocalPostOfficeTwoTone"))
