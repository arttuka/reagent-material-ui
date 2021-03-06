(ns reagent-material-ui.icons.workspaces-two-tone
  "Imports @material-ui/icons/WorkspacesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def workspaces-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "2", "cx" "6", "opacity" ".3"}) (e "circle" #js {"cy" "7", "r" "2", "cx" "12", "opacity" ".3"}) (e "circle" #js {"cy" "17", "r" "2", "cx" "18", "opacity" ".3"}) (e "path" #js {"d" "M18 13c-2.2 0-4 1.8-4 4s1.8 4 4 4 4-1.8 4-4-1.8-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zM6 13c-2.2 0-4 1.8-4 4s1.8 4 4 4 4-1.8 4-4-1.8-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zM16 7c0-2.2-1.8-4-4-4S8 4.8 8 7s1.8 4 4 4 4-1.8 4-4zm-4 2c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"}))
                                          "WorkspacesTwoTone"))
