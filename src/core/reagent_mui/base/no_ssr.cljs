(ns reagent-mui.base.no-ssr
  "Imports @mui/base/NoSsr as a Reagent component.
   Original documentation is at https://mui.com/api/no-ssr/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/NoSsr" :as MuiNoSsr]))

(def no-ssr (adapt-react-class (.-default MuiNoSsr) "mui-no-ssr"))
