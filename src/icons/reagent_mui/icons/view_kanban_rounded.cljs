(ns reagent-mui.icons.view-kanban-rounded
  "Imports @mui/icons-material/ViewKanbanRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-kanban-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM8 17c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v8c0 .55-.45 1-1 1zm4-5c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v3c0 .55-.45 1-1 1zm4 3c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v6c0 .55-.45 1-1 1z"})
                                          "ViewKanbanRounded"))
