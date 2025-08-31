INSERT INTO departments (id, department_name, department_description) VALUES
(1, 'Computer Science & Engineering', 'Focuses on computer systems, programming, and algorithms.'),
(2, 'Electronics & Communication Engineering', 'Covers electronic devices, circuits, and communication systems.'),
(3, 'Mechanical Engineering', 'Deals with the design, analysis, and manufacturing of mechanical systems.'),
(4, 'Chemical Engineering', 'Focuses on chemical processes and industrial chemical production.'),
(5, 'Civil Engineering', 'Involves construction, infrastructure, and structural design.'),
(6, 'Electrical Engineering', 'Covers power systems, control systems, and electrical circuits.');


-- Insert courses
INSERT INTO courses (course_code, course_name, course_description, department_id) VALUES
('CSE101', 'Introduction to Programming', 'Covers the fundamentals of programming using a high-level language, including variables, control structures, and basic problem-solving techniques.', 1),
('CSE202', 'Data Structures and Algorithms', 'Explores essential data structures, algorithm design techniques, and complexity analysis for efficient problem solving.', 1),
('CSE305', 'Database Management Systems', 'Introduction to relational databases, SQL, normalization, indexing, and transaction management.', 1),
('CSE410', 'Operating Systems', 'Studies the design and implementation of operating systems including process management, memory management, and file systems.', 1),

('ECE101', 'Digital Electronics', 'Covers the basics of digital logic design, combinational and sequential circuits, and digital system applications.', 2),
('ECE220', 'Signals and Systems', 'Analyzes continuous and discrete-time signals, linear systems, and their applications in communication and control.', 2),
('ECE315', 'Communication Systems', 'Explores analog and digital communication techniques, modulation, and transmission principles.', 2),

('ME101', 'Engineering Mechanics', 'Focuses on the fundamentals of statics and dynamics, force systems, and the equilibrium of bodies.', 3),
('ME210', 'Thermodynamics', 'Covers the principles of thermodynamics, energy, heat transfer, and their applications in mechanical systems.', 3),
('ME320', 'Fluid Mechanics', 'Examines the properties of fluids, fluid statics, dynamics, and flow measurement techniques.', 3),

('CH101', 'Chemical Process Principles', 'Introduces the basic concepts of chemical engineering processes, material and energy balances.', 4),
('CH205', 'Organic Chemistry for Engineers', 'Covers the fundamental concepts of organic chemistry and its relevance to industrial processes.', 4),
('CH310', 'Process Control and Instrumentation', 'Focuses on process dynamics, control theory, and instrumentation used in chemical industries.', 4),

('CV101', 'Structural Analysis', 'Covers analysis methods for trusses, beams, and frames, with emphasis on equilibrium and load distribution.', 5),

('EE105', 'Electrical Circuits', 'Introduces the basic laws and techniques for analyzing electrical circuits and their components.', 6);
