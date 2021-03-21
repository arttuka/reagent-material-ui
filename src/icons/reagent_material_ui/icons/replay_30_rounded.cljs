(ns reagent-material-ui.icons.replay-30-rounded
  "Imports @material-ui/icons/Replay30Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def replay-30-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4V2.21c0-.45-.54-.67-.85-.35l-2.8 2.79c-.2.2-.2.51 0 .71l2.79 2.79c.32.31.86.09.86-.36V6c3.89 0 7.06 3.2 7 7.1-.05 3.71-3.18 6.84-6.9 6.9-3.62.05-6.62-2.65-7.05-6.14-.06-.5-.48-.86-.98-.86-.6 0-1.07.53-1 1.12.56 4.52 4.48 8 9.19 7.87 4.7-.13 8.61-4.05 8.74-8.74C21.14 8.17 17.06 4 12 4z"}) (e "path" #js {"d" "M15.5 16c.55 0 1-.45 1-1v-4c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1h2zM14 11.5h1v3h-1v-3zM11.5 15v-4c0-.55-.45-1-1-1H8.25c-.41 0-.75.34-.75.75s.34.75.75.75H10v1H9c-.28 0-.5.22-.5.5s.22.5.5.5h1v1H8.25c-.41 0-.75.34-.75.75s.34.75.75.75h2.25c.55 0 1-.45 1-1z"}))
                                        "Replay30Rounded"))
