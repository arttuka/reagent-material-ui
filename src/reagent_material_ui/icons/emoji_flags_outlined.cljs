(ns reagent-material-ui.icons.emoji-flags-outlined
  "Imports @material-ui/icons/EmojiFlagsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def emoji-flags-outlined (create-svg-icon (e "path" #js {"d" "M14 9l-1-2H7V5.72c.6-.34 1-.98 1-1.72 0-1.1-.9-2-2-2s-2 .9-2 2c0 .74.4 1.38 1 1.72V21h2v-4h5l1 2h7V9h-6zm4 8h-4l-1-2H7V9h5l1 2h5v6z"})
                                           "EmojiFlagsOutlined"))
