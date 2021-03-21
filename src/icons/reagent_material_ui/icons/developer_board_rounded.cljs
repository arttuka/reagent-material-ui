(ns reagent-material-ui.icons.developer-board-rounded
  "Imports @material-ui/icons/DeveloperBoardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def developer-board-rounded (create-svg-icon (e "path" #js {"d" "M22 8c0-.55-.45-1-1-1h-1V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-2h1c.55 0 1-.45 1-1s-.45-1-1-1h-1v-2h1c.55 0 1-.45 1-1s-.45-1-1-1h-1V9h1c.55 0 1-.45 1-1zm-4 11H4V5h14v14zM7 13h3c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1H7c-.55 0-1-.45-1-1v-2c0-.55.45-1 1-1zm6-6h2c.55 0 1 .45 1 1v1c0 .55-.45 1-1 1h-2c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1zM7 7h3c.55 0 1 .45 1 1v3c0 .55-.45 1-1 1H7c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1zm6 4h2c.55 0 1 .45 1 1v4c0 .55-.45 1-1 1h-2c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1z"})
                                              "DeveloperBoardRounded"))
