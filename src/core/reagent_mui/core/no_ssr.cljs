(ns reagent-mui.core.no-ssr
  "Imports @mui/core/NoSsr as a Reagent component.
   Original documentation is at https://mui.com/api/no-ssr/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/NoSsr" :as MuiNoSsr]))

(def no-ssr (adapt-react-class (.-default MuiNoSsr) "mui-no-ssr"))
