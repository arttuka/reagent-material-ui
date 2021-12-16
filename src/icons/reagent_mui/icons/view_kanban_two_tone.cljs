(ns reagent-mui.icons.view-kanban-two-tone
  "Imports @mui/icons-material/ViewKanbanTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-kanban-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zM15 7h2v8h-2V7zm-4 0h2v5h-2V7zM7 7h2v10H7V7z", "opacity" ".3"}) (e "path" #js {"d" "M7 7h2v10H7zm4 0h2v5h-2zm4 0h2v8h-2z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"})]
                                           "ViewKanbanTwoTone"))
