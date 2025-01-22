q: question;
g: question;
f: fraction;

code-hole Question.q1 is
    println "Complete o seguinte código.";

end; # automatic grading

hole Question.q2 is
    println "A sigla PIL significa " ans->"Procedural Imperative Language" ".";
    uses code PIL.Example1
      10,"n % 2 = 0"; # grade 10, first match for text
      5,"else" line 2 # grade 5, first match starting at line 2 for text
      # syntax (comma separated): [grade] [match-count] text
   end;
end; # total points defined in question: 10+5=15, final grade: sum-correct-points / total-points
end; # automatic grading

q := new Question;      # select a random question from group Question (either q1 or q2)
f := execute q;         # execute question stored in variable q


g := new Question;      # select a random question from group Question (the question previously selected should not be an option in order to avoid repetetition)
f := execute g;         # execute question stored in variable q

export result to "result.txt"; # export (to a file) current questionnaire results
# export command can be executed anywhere!