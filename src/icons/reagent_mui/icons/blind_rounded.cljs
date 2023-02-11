(ns reagent-mui.icons.blind-rounded
  "Imports @mui/icons-material/BlindRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def blind-rounded (create-svg-icon [(e "circle" #js {"cx" "11.41", "cy" "3.5", "r" "2"}) (e "path" #js {"d" "M12.04 7.12c-.17-.35-.44-.65-.8-.85-.61-.36-1.34-.34-1.93-.03v-.01l-4.39 2.5c-.62.35-1.01 1.01-1.01 1.73V13c0 .55.45 1 1 1s1-.45 1-1v-2.54l1.5-.85c-.32 1.1-.5 2.24-.5 3.39v5.33l-2 2.67c-.33.44-.24 1.07.2 1.4.44.33 1.07.24 1.4-.2l2.04-2.72c.23-.31.37-.69.4-1.08l.18-2.94L10.91 18v4c0 .55.45 1 1 1s1-.45 1-1v-4.87c0-.41-.13-.81-.36-1.15l-1.6-2.29v-.01c-.11-1.16.07-2.32.46-3.4.75 1.14 1.88 1.98 3.2 2.41l5.7 9.87c.14.24.44.32.68.18.24-.14.32-.44.18-.68L15.92 13c.54 0 .98-.44.98-.98v-.05c0-.5-.37-.94-.87-.99-.95-.1-2.37-.52-3.21-2.18"})]
                                    "BlindRounded"))
