(ns reagent-material-ui.icons.dinner-dining-sharp
  "Imports @material-ui/icons/DinnerDiningSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dinner-dining-sharp (create-svg-icon (e "path" #js {"d" "M2 19l2 2h16l2-2zm1-1h16.97c.29-3.26-2.28-6-5.48-6-2.35 0-4.35 1.48-5.14 3.55-.41-.23-.87-.38-1.35-.47V9h4V6.75h9v-1.5h-9V3H3v1.5h1v.75H3v1.5h1v.75H3V9h1v7.39c-.44.46-.78 1-1 1.61zM8 7.5v-.75h2v.75H8zm2-2.25H8V4.5h2v.75zM5.5 4.5h1v.75h-1V4.5zm0 2.25h1v.75h-1v-.75zM6.5 9v6.06c-.35.06-.68.17-1 .3V9h1z"})
                                          "DinnerDiningSharp"))
