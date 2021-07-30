(ns reagent-material-ui.icons.where-to-vote-rounded
  "Imports @material-ui/icons/WhereToVoteRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def where-to-vote-rounded (create-svg-icon (e "path" #js {"d" "M12 2c-4.2 0-8 3.22-8 8.2 0 3.18 2.45 6.92 7.34 11.23.38.33.95.33 1.33 0C17.55 17.12 20 13.38 20 10.2 20 5.22 16.2 2 12 2zm-1.77 10.66-1.41-1.41a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l.71.71 2.83-2.83c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41l-3.54 3.54c-.38.38-1.02.38-1.41-.01z"})
                                            "WhereToVoteRounded"))
