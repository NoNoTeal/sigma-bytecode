public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u64ab\uae5d\u0800\u3dd3\u183a\uc87f {
    public void \u64ab\uae5d\u0800\u3dd3\u183a\uc87f(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u64ab\uae5d\u0800\u3dd3\u183a\uc87f)
            putfield:Map<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>(\u64ab\uae5d\u0800\u3dd3\u183a\uc87f::\uc2e8\uc4d2\u9255\ud4fe\uf9c5\ub70c, this:\u64ab\uae5d\u0800\u3dd3\u183a\uc87f, invokestatic:TreeMap[expected:Map<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>](Maps::newTreeMap, invokevirtual:Ordering[expected:Comparator](Ordering::reverse, invokestatic:Ordering(Ordering::natural))))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64ab\uae5d\u0800\u3dd3\u183a\uc87f::\ud158\ub19c\u960f\u4179\u965f\u16f6, this:\u64ab\uae5d\u0800\u3dd3\u183a\uc87f, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6c56\u4daf\ucb79\ud12e\ub8be\u965f(long p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u4daf\u7af6\u8350\u8709\ubb2b\u4e72(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p1, double p2, double p3, double p4) {
        var_9_61 : int
        var_11_6D : long
        var_16_80 : HashSet
        var_17_85 : HashMap
        var_18_90 : \u6b0d\uf9c5\ucfaf\ud36e\ub102
        var_19_A0 : Iterator<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>
        var_9_137 : int
        var_20_FD : Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>
        var_21_109 : Long
        var_22_115 : Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>
        var_23_11F : long
        var_25_145 : Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>
        var_26_190 : Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>
        var_27_19C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_28_1A8 : Integer
        var_29_1FE : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7
        var_20_EA : Iterator<Entry<Object, Object>>
        var_21_25C : Entry<Object, Object>
        var_22_268 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_9_61 = and:int(ldc:int(829335387), ldc:int(2070867167))
            var_11_6D = invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64ab\uae5d\u0800\u3dd3\u183a\uc87f::\ud158\ub19c\u960f\u4179\u965f\u16f6, this:\u64ab\uae5d\u0800\u3dd3\u183a\uc87f)))
            var_16_80 = invokestatic:HashSet(Sets::newHashSet)
            var_17_85 = invokestatic:HashMap(Maps::newHashMap)
            var_18_90 = invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p1:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u7d52\u071d\u120d\u183a\ucb79\u8258))
            var_19_A0 = invokeinterface:Iterator<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>(Set<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>::iterator, invokeinterface:Set<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>(Map<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>::entrySet, getfield:Map<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>(\u64ab\uae5d\u0800\u3dd3\u183a\uc87f::\uc2e8\uc4d2\u9255\ud4fe\uf9c5\ub70c, this:\u64ab\uae5d\u0800\u3dd3\u183a\uc87f)))
            
            loop {
                if (cmpeq:boolean(and:int(var_9_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_9_137 = and:int(var_9_61:int, ldc:int(-1237157840))
                }
                else {
                    var_9_137 = and:int(var_9_61:int, ldc:int(-1111858065))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_19_A0:Iterator<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>)) {
                        var_20_FD = checkcast:Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>(java.util.Map.Entry<java.lang.Long, java.util.Map<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, java.lang.Integer>>.class, invokeinterface:Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>(Iterator<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>::next, var_19_A0:Iterator<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>))
                        var_21_109 = checkcast:Long(java.lang.Long.class, invokeinterface:Long(Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>::getKey, var_20_FD:Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>))
                        var_22_115 = checkcast:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>(java.util.Map<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, java.lang.Integer>.class, invokeinterface:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>(Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>::getValue, var_20_FD:Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>))
                        var_23_11F = sub:long(var_11_6D:long, invokevirtual:long(Long::longValue, var_21_109:Long))
                        
                        if (cmpgt:boolean(var_23_11F:long, ldc:long(200L))) {
                            invokeinterface:void(Iterator::remove, var_19_A0:Iterator<Entry<Long, Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>>)
                            goto(Label_0358)
                        }
                        
                        Label_0298:
                        
                        if (cmpeq:boolean(and:int(var_9_137:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_9_137 = and:int(var_9_137:int, ldc:int(1072362829))
                            var_25_145 = invokeinterface:Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>(Set<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>::iterator, invokeinterface:Set<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>::entrySet, var_22_115:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>))
                            
                            while (invokeinterface:boolean(Iterator::hasNext, var_25_145:Iterator)) {
                                var_26_190 = checkcast:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>(java.util.Map.Entry<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, java.lang.Integer>.class, invokeinterface:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>(Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>::next, var_25_145:Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>>))
                                var_27_19C = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>::getKey, var_26_190:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>))
                                var_28_1A8 = checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>::getValue, var_26_190:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>))
                                
                                if (invokeinterface:boolean(Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_16_80:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_27_19C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                                    var_29_1FE = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7af6\u8df4\u4cd9\u9033\u6cfe\u600f, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b)), ldc:double(0.002)), mul:double(ldc:double(0.0025), l2d:double(var_23_11F:long))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_27_19C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_27_19C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_27_19C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), neg:double(p2:double), neg:double(p3:double), neg:double(p4:double))
                                    invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u9255\u4daf\u760c\u4cd9\ub102, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_18_90:\u6b0d\uf9c5\ucfaf\ud36e\ub102, getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, var_29_1FE:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, var_29_1FE:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, var_29_1FE:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, var_29_1FE:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, var_29_1FE:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, var_29_1FE:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                                    invokeinterface:Integer(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>::put, var_17_85:HashMap<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>[expected:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Integer>], var_27_19C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_28_1A8:Integer)
                                }
                                
                                var_9_137 = and:int(var_9_137:int, ldc:int(-215077777))
                            }
                        }
                        
                        Label_0358:
                        
                        if (cmpeq:boolean(and:int(var_9_137:int, ldc:int(536870912)), ldc:int(0))) {
                            var_9_137 = and:int(var_9_137:int, ldc:int(-1481598754))
                            goto(Label_0298)
                        }
                        
                        var_9_61 = and:int(var_9_137:int, ldc:int(-72733221))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_9_137:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_9_61 = and:int(var_9_137:int, ldc:int(-682394095))
            }
            
            var_20_EA = invokeinterface:Iterator<Entry<Object, Object>>(Set<Entry<Object, Object>>::iterator, invokeinterface:Set<Entry<Object, Object>>(Map<Object, Object>::entrySet, var_17_85:HashMap<Object, Object>[expected:Map<Object, Object>]))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_20_EA:Iterator)) {
                var_21_25C = checkcast:Entry<Object, Object>(java.util.Map.Entry<java.lang.Object, java.lang.Object>.class, invokeinterface:Entry<Object, Object>(Iterator<Entry<Object, Object>>::next, var_20_EA:Iterator<Entry<Object, Object>>))
                var_22_268 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Object>::getKey, var_21_25C:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, Object>))
                invokestatic:void(\u64f2\uf995\u8258\ub102\u983f\u1833::\u6b5f\uc2bd\uff55\u7049\uff55\uc7fe, invokestatic:String(String::valueOf, checkcast:Integer[expected:Object](java.lang.Integer.class, invokeinterface:Integer(Entry<Object, Integer>::getValue, var_21_25C:Entry<Object, Integer>))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_22_268:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_22_268:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_22_268:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(-1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map lambda$\u97e6\u494c\u647c\u8389\uc9f6\u385b$0(java.lang.Long p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Map(invokestatic:HashMap[expected:Map](Maps::newHashMap))
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u446c\u36d3\u74b1\u0b8e\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_656 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_661 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_656 = and:int(ldc:int(-12681334), ldc:int(-541163926))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\uae5d\u0800\u3dd3\u183a\uc87f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
            var_3_656 = and:int(var_3_656:int, ldc:int(-1638675748))
        }
        else {
            var_3_656 = and:int(var_3_656:int, ldc:int(-612377823))
            var_5_8A = and:int(ldc:int(-13209), ldc:int(12952))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7264), ldc:int(-7265)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_656:int, ldc:int(-545330193))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(-31484), ldc:int(-31483)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(89), ldc:int(88)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_656 = and:int(var_3_DA:int, ldc:int(-604045721))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(313), ldc:int(12417)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-183599677))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1220125123))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(522917962))
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-79737239))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0547)
                            }
                            
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1716083902))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1814063745))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-8392804))
                            var_11_EB = and:int(ldc:int(16952), ldc:int(-25401))
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0547:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1568353811))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(644217071))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1048066233))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1900045072))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(502649829))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-541073451))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0679:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-137828295))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1267043514))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(793067330))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1113686699))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1114540711))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-883246453))
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1588118169))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(535082688))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-536937628))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0844:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-2010861425))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(942998312))
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-70826))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(10497), ldc:int(16993))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0951:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(652814969))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-2023708445))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1334506598))
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1869431789))
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-616632526))
                        var_11_EB = and:int(ldc:int(-2508), ldc:int(2506))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1327048964))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-891078182))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1397765619))
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-604873618))
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(636261998))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-545366448))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(888890266))
                            goto(Label_1110)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(64220808))
                            goto(Label_0844)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(113876195))
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0547)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1086455764))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-536916444))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1507)
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1798478979))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1345421044))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(442973338))
                        goto(Label_0679)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(-536982770))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1507:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_661 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1794201000))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-155088765))
                        goto(Label_0547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-541069606))
                        var_17_661 = add:int(var_16_119:int, and:int(ldc:int(4139), ldc:int(3841)))
                        looporswitchbreak()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(-1063657167))
                }
                
                var_3_656 = and:int(var_3_656:int, ldc:int(-67122346))
                
                if (cmple:boolean(var_5_8A = var_17_661:int, sub:int(var_6_91:int, and:int(ldc:int(1043), ldc:int(20641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
