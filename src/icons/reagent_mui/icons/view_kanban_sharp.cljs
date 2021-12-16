(ns reagent-mui.icons.view-kanban-sharp
  "Imports @mui/icons-material/ViewKanbanSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-kanban-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM9 17H7V7h2v10zm4-5h-2V7h2v5zm4 3h-2V7h2v8z"})
                                        "ViewKanbanSharp"))
