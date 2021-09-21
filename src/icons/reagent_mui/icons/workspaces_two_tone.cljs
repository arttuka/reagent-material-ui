(ns reagent-mui.icons.workspaces-two-tone
  "Imports @mui/icons-material/WorkspacesTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def workspaces-two-tone (create-svg-icon [(e "circle" #js {"cx" "6", "cy" "17", "r" "2", "opacity" ".3"}) (e "circle" #js {"cx" "12", "cy" "7", "r" "2", "opacity" ".3"}) (e "circle" #js {"cx" "18", "cy" "17", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "M18 13c-2.2 0-4 1.8-4 4s1.8 4 4 4 4-1.8 4-4-1.8-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zM6 13c-2.2 0-4 1.8-4 4s1.8 4 4 4 4-1.8 4-4-1.8-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zM16 7c0-2.2-1.8-4-4-4S8 4.8 8 7s1.8 4 4 4 4-1.8 4-4zm-4 2c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})]
                                          "WorkspacesTwoTone"))
