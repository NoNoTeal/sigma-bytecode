public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub7dc\u64f2\u385b\ud171\u760c {
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub7dc\u64f2\u385b\ud171\u760c \u12b2\u1833\ud171\ucfaf\u8308\u59ec(java.nio.file.Path p0) {
        var_1_B5 : int
        var_3_76 : Path
        var_1_297 : int
        stack_162_0 : Path [generated]
        expr_147 : OpenOption[] [generated]
        var_4_165 : FileChannel
        var_5_1E5 : FileLock
        expr_246 : \ub7dc\u64f2\u385b\ud171\u760c [generated]
        var_5_25B : IOException
        var_6_291 : IOException
        
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
        var_1_B5 = and:int(and:int(ldc:int(1904336849), ldc:int(-882770609)), ldc:int(1533533650))
        var_3_76 = invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ub7dc\u64f2\u385b\ud171\u760c::\u6cfe\u34df\u6b5f\u7c6b\u5bc4\u2dcc), and:int(ldc:int(6868), ldc:int(-7925))))
        
        loop {
            if (cmpne:boolean(and:int(var_1_B5:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0269)
            }
            
            if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(64)), ldc:int(0))) {
                var_1_B5 = and:int(var_1_B5:int, ldc:int(-933553671))
                goto(Label_0212)
            }
            
            if (cmpne:boolean(and:int(var_1_B5:int, ldc:int(256)), ldc:int(0))) {
                var_1_B5 = and:int(var_1_B5:int, ldc:int(-645537966))
                
                if (invokestatic:boolean(Files::isDirectory, p0:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-15684), ldc:int(15683))))) {
                    goto(Label_0269)
                }
            }
            
            Label_0170:
            
            if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(16384)), ldc:int(0))) {
                var_1_B5 = and:int(var_1_B5:int, ldc:int(685778620))
                goto(Label_0269)
            }
            
            if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(2048)), ldc:int(0))) {
                var_1_B5 = and:int(var_1_B5:int, ldc:int(-1805121702))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(64)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_B5 = and:int(var_1_B5:int, ldc:int(1743511409))
            }
            
            Label_0212:
            
            if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_B5 = and:int(var_1_B5:int, ldc:int(-57387021))
                    goto(Label_0170)
                }
                
                if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_B5 = and:int(var_1_B5:int, ldc:int(834412430))
                    loopcontinue()
                }
                
                var_1_B5 = and:int(var_1_B5:int, ldc:int(1742856028))
                invokestatic:Path(Files::createDirectories, p0:Path, newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(1298), ldc:int(-1299))))
            }
            
            Label_0269:
            
            if (cmpne:boolean(and:int(var_1_B5:int, ldc:int(8)), ldc:int(0))) {
                var_1_B5 = and:int(var_1_B5:int, ldc:int(-352056751))
                goto(Label_0212)
            }
            
            if (cmpeq:boolean(and:int(var_1_B5:int, ldc:int(256)), ldc:int(0))) {
                var_1_B5 = and:int(var_1_B5:int, ldc:int(1096434332))
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_1_B5:int, ldc:int(1024)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_1_B5 = and:int(var_1_B5:int, ldc:int(-2105954212))
        }
        
        var_1_297 = and:int(var_1_B5:int, ldc:int(-207487133))
        stack_162_0 = var_3_76:Path
        expr_147 = newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(2), ldc:int(98)))
        storeelement:OpenOption(expr_147:OpenOption[], and:int(ldc:int(-5643), ldc:int(5642)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::CREATE))
        storeelement:OpenOption(expr_147:OpenOption[], and:int(ldc:int(99), ldc:int(4741)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::WRITE))
        var_4_165 = invokestatic:FileChannel(FileChannel::open, stack_162_0:Path, expr_147:OpenOption[])
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0445)
                }
                
                if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_297 = and:int(var_1_297:int, ldc:int(-1050271398))
                }
                else {
                    var_1_297 = and:int(var_1_297:int, ldc:int(-71303189))
                    invokevirtual:int(FileChannel::write, var_4_165:FileChannel, invokevirtual:ByteBuffer(ByteBuffer::duplicate, getstatic:ByteBuffer(\ub7dc\u64f2\u385b\ud171\u760c::\uae5d\uc3e3\ube23\u7ce1\u4c04\u4975)))
                }
                
                Label_0398:
                
                if (cmpne:boolean(and:int(var_1_297:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_297 = and:int(var_1_297:int, ldc:int(1004562349))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_297 = and:int(var_1_297:int, ldc:int(-360443232))
                        loopcontinue()
                    }
                    
                    var_1_297 = and:int(var_1_297:int, ldc:int(1372848119))
                    invokevirtual:void(FileChannel::force, var_4_165:FileChannel, and:int[expected:boolean](ldc:int(16853), ldc:int(1)))
                }
                
                Label_0445:
                
                if (cmpne:boolean(and:int(var_1_297:int, ldc:int(8)), ldc:int(0))) {
                    var_1_297 = and:int(var_1_297:int, ldc:int(1688504454))
                    goto(Label_0398)
                }
                
                if (cmpne:boolean(and:int(var_1_297:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_297 = and:int(var_1_297:int, ldc:int(577483404))
            }
            
            var_1_297 = and:int(var_1_297:int, ldc:int(-11141293))
            var_5_1E5 = invokevirtual:FileLock(FileChannel::tryLock, var_4_165:FileChannel)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0538)
                }
                
                if (cmpne:boolean(and:int(var_1_297:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_297 = and:int(var_1_297:int, ldc:int(1267851115))
                    
                    if (cmpne:boolean(var_5_1E5:FileLock, aconstnull:FileLock())) {
                        expr_246 = initobject:\ub7dc\u64f2\u385b\ud171\u760c(\ub7dc\u64f2\u385b\ud171\u760c::<init>, var_4_165:FileChannel, var_5_1E5:FileLock)
                        var_1_297 = and:int(var_1_297:int, ldc:int(1676279667))
                        return:\ub7dc\u64f2\u385b\ud171\u760c(expr_246:\ub7dc\u64f2\u385b\ud171\u760c)
                    }
                }
                
                Label_0511:
                
                if (cmpne:boolean(and:int(var_1_297:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(64)), ldc:int(0))) {
                        var_1_297 = and:int(var_1_297:int, ldc:int(1506267156))
                        loopcontinue()
                    }
                    
                    var_1_297 = and:int(var_1_297:int, ldc:int(1643249513))
                }
                
                Label_0538:
                
                if (cmpne:boolean(and:int(var_1_297:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_297 = and:int(var_1_297:int, ldc:int(1085834898))
                    goto(Label_0511)
                }
                
                if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_297 = and:int(var_1_297:int, ldc:int(2071723518))
                    athrow(invokestatic:\uc31c\u760c\u927d\uc84e\u0800(\uc31c\u760c\u927d\uc84e\u0800::\u64f2\ud523\ube23\u5654\u3c25\u4492, var_3_76:Path))
                }
                
                var_1_297 = and:int(var_1_297:int, ldc:int(-400571246))
            }
        }
        catch (java.io.IOException var_5_25B) {
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_297:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_297 = and:int(var_1_297:int, ldc:int(-1677973566))
                    }
                    else {
                        var_1_297 = and:int(var_1_297:int, ldc:int(-279445667))
                        invokevirtual:void(AbstractInterruptibleChannel::close, var_4_165:FileChannel[expected:AbstractInterruptibleChannel])
                    }
                    
                    if (cmpne:boolean(and:int(var_1_297:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_297 = and:int(var_1_297:int, ldc:int(1696679055))
                }
                
                var_1_297 = and:int(var_1_297:int, ldc:int(-67764416))
            }
            catch (java.io.IOException var_6_291) {
                var_1_297 = and:int(var_1_297:int, ldc:int(-888668352))
                invokevirtual:void(Throwable::addSuppressed, var_5_25B:IOException[expected:Throwable], var_6_291:IOException[expected:Throwable])
            }
            
            athrow(var_5_25B:IOException)
        }
    }
    
    private void \ub7dc\u64f2\u385b\ud171\u760c(java.nio.channels.FileChannel p0, java.nio.channels.FileLock p1) {
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
            invokespecial:Object(Object::<init>, this:\ub7dc\u64f2\u385b\ud171\u760c)
            putfield:FileChannel(\ub7dc\u64f2\u385b\ud171\u760c::\ubcb0\ub18d\u5db4\ub113\uf94d\u6435, this:\ub7dc\u64f2\u385b\ud171\u760c, p0:FileChannel)
            putfield:FileLock(\ub7dc\u64f2\u385b\ud171\u760c::\u5db4\u4bc8\ua3b4\u76bc\u8df4\u7043, this:\ub7dc\u64f2\u385b\ud171\u760c, p1:FileLock)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
        var_1_243 : int
        
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
            var_1_243 = and:int(ldc:int(534673665), ldc:int(-1885353528))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0451)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(2)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(1425263934))
                        goto(Label_0379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0305)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-1185966616))
                        goto(Label_0242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-1256563120))
                    }
                    else {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-610641182))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(FileLock::isValid, getfield:FileLock(\ub7dc\u64f2\u385b\ud171\u760c::\u5db4\u4bc8\ua3b4\u76bc\u8df4\u7043, this:\ub7dc\u64f2\u385b\ud171\u760c)))) {
                            goto(Label_0305)
                        }
                    }
                    
                    Label_0170:
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(361462062))
                        goto(Label_0451)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-1387309085))
                        goto(Label_0305)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(32)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(2046023837))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(2)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(-1486649245))
                            loopcontinue()
                        }
                        
                        var_1_243 = and:int(var_1_243:int, ldc:int(-540529896))
                    }
                    
                    Label_0242:
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(8041946))
                        goto(Label_0451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-2007006408))
                        goto(Label_0379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0170)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_243 = and:int(var_1_243:int, ldc:int(2061463472))
                        invokevirtual:void(FileLock::release, getfield:FileLock(\ub7dc\u64f2\u385b\ud171\u760c::\u5db4\u4bc8\ua3b4\u76bc\u8df4\u7043, this:\ub7dc\u64f2\u385b\ud171\u760c))
                    }
                    
                    Label_0305:
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0451)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(8)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(1126721937))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(857360924))
                            goto(Label_0242)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(-912743866))
                            goto(Label_0170)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_243 = and:int(var_1_243:int, ldc:int(-22515154))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(AbstractInterruptibleChannel::isOpen, getfield:FileChannel[expected:AbstractInterruptibleChannel](\ub7dc\u64f2\u385b\ud171\u760c::\ubcb0\ub18d\u5db4\ub113\uf94d\u6435, this:\ub7dc\u64f2\u385b\ud171\u760c)))) {
                            return:void()
                        }
                    }
                    
                    Label_0379:
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-1652078768))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(-858952002))
                            goto(Label_0305)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0242)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(64)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(-732282519))
                            goto(Label_0170)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(4)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(1575499115))
                            loopcontinue()
                        }
                        
                        var_1_243 = and:int(var_1_243:int, ldc:int(-1090583623))
                    }
                    
                    Label_0451:
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(64)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(769391687))
                        goto(Label_0379)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(32)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(-1391166281))
                        goto(Label_0305)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_243:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_243 = and:int(var_1_243:int, ldc:int(680160971))
                        goto(Label_0170)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_243:int, ldc:int(33554432)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_243 = and:int(var_1_243:int, ldc:int(1405767508))
                }
                
                var_1_243 = and:int(var_1_243:int, ldc:int(462003807))
                invokevirtual:void(AbstractInterruptibleChannel::close, getfield:FileChannel[expected:AbstractInterruptibleChannel](\ub7dc\u64f2\u385b\ud171\u760c::\ubcb0\ub18d\u5db4\ub113\uf94d\u6435, this:\ub7dc\u64f2\u385b\ud171\u760c))
            }
            finally {
                if (invokevirtual:boolean(AbstractInterruptibleChannel::isOpen, getfield:FileChannel[expected:AbstractInterruptibleChannel](\ub7dc\u64f2\u385b\ud171\u760c::\ubcb0\ub18d\u5db4\ub113\uf94d\u6435, this:\ub7dc\u64f2\u385b\ud171\u760c))) {
                    do {
                        if (cmpne:boolean(and:int(var_1_243:int, ldc:int(4)), ldc:int(0))) {
                            var_1_243 = and:int(var_1_243:int, ldc:int(1100864381))
                        }
                        else {
                            var_1_243 = and:int(var_1_243:int, ldc:int(2139898295))
                        }
                    } while (cmpne:boolean(and:int(var_1_243:int, ldc:int(4)), ldc:int(0)))
                    
                    var_1_243 = and:int(var_1_243:int, ldc:int(1593445554))
                    invokevirtual:void(AbstractInterruptibleChannel::close, getfield:FileChannel[expected:AbstractInterruptibleChannel](\ub7dc\u64f2\u385b\ud171\u760c::\ubcb0\ub18d\u5db4\ub113\uf94d\u6435, this:\ub7dc\u64f2\u385b\ud171\u760c))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucef1\u4f52\ubff1\uae5d\u120d\u12b2() {
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
            return:boolean(invokevirtual:boolean(FileLock::isValid, getfield:FileLock(\ub7dc\u64f2\u385b\ud171\u760c::\u5db4\u4bc8\ua3b4\u76bc\u8df4\u7043, this:\ub7dc\u64f2\u385b\ud171\u760c)))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u527a\u516c\u1187\u927d\u40a9\u5f50(java.nio.file.Path p0) {
        var_1_64 : int
        var_3_76 : Path
        stack_93_0 : Path [generated]
        expr_84 : OpenOption[] [generated]
        var_4_96 : FileChannel
        var_5_9E : Throwable
        var_6_A5 : FileLock
        var_7_A8 : Throwable
        var_8_123 : Throwable
        var_11_148 : Throwable
        var_6_164 : Throwable
        var_13_189 : Throwable
        
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
        var_1_64 = and:int(and:int(ldc:int(1035408392), ldc:int(53934599)), ldc:int(-1367960722))
        var_3_76 = invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ub7dc\u64f2\u385b\ud171\u760c::\u6cfe\u34df\u6b5f\u7c6b\u5bc4\u2dcc), and:int(ldc:int(-16672), ldc:int(16670))))
        
        try {
            var_1_64 = and:int(var_1_64:int, ldc:int(494368816))
            stack_93_0 = var_3_76:Path
            expr_84 = newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(9233), ldc:int(4235)))
            storeelement:OpenOption(expr_84:OpenOption[], and:int(ldc:int(-29198), ldc:int(29189)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::WRITE))
            var_4_96 = invokestatic:FileChannel(FileChannel::open, stack_93_0:Path, expr_84:OpenOption[])
            var_1_64 = and:int(var_1_64:int, ldc:int(666875841))
            var_5_9E = aconstnull:Throwable()
            
            try {
                var_6_A5 = invokevirtual:FileLock(FileChannel::tryLock, var_4_96:FileChannel)
                var_7_A8 = aconstnull:Throwable()
                
                try {
                    return:boolean(ternaryop:int(cmpeq:boolean(var_6_A5:FileLock, aconstnull:FileLock()), xor:int(ldc:int(-24558), ldc:int(-24557)), and:int(ldc:int(26657), ldc:int(-26658))))
                }
                catch (java.lang.Throwable var_8_123) {
                    var_7_A8 = var_8_123:Throwable
                    athrow(var_8_123:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_6_A5:FileLock, aconstnull:FileLock())) {
                        if (cmpne:boolean(var_7_A8:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(FileLock::close, var_6_A5:FileLock)
                            }
                            catch (java.lang.Throwable var_11_148) {
                                invokevirtual:void(Throwable::addSuppressed, var_7_A8:Throwable, var_11_148:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(FileLock::close, var_6_A5:FileLock)
                        }
                    }
                }
            }
            catch (java.lang.Throwable var_6_164) {
                var_5_9E = var_6_164:Throwable
                athrow(var_6_164:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_96:FileChannel, aconstnull:FileChannel())) {
                    if (cmpne:boolean(var_5_9E:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(AbstractInterruptibleChannel::close, var_4_96:FileChannel[expected:AbstractInterruptibleChannel])
                        }
                        catch (java.lang.Throwable var_13_189) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_9E:Throwable, var_13_189:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(AbstractInterruptibleChannel::close, var_4_96:FileChannel[expected:AbstractInterruptibleChannel])
                    }
                }
            }
        }
        catch (java.nio.file.AccessDeniedException var_4_1A5) {
            return:boolean(and:int[expected:boolean](ldc:int(4227), ldc:int(8481)))
        }
        catch (java.nio.file.NoSuchFileException var_4_1B8) {
            return:boolean(and:int[expected:boolean](ldc:int(-28057), ldc:int(27784)))
        }
    }
    
    static {
        var_0_22A : int
        expr_6C : int [generated]
        stack_87_0 : byte[] [generated]
        stack_89_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_180_0 : byte[] [generated]
        stack_1D7_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        var_5_162 : int
        var_3_167 : byte[]
        var_6_168 : int
        expr_180 : byte [generated]
        var_0_233 : int
        expr_23D : byte [generated]
        stack_26D_2 : byte [generated]
        var_2_87 : byte[]
        expr_8B : int [generated]
        var_3_1C5 : byte[]
        var_6_1C6 : int
        expr_B1 : int [generated]
        var_3_E1 : String
        expr_E9 : String[] [generated]
        expr_F3 : String[] [generated]
        var_4_141 : byte[]
        
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
        var_0_22A = and:int(ldc:int(1261446657), ldc:int(-1145639874))
        expr_6C = arraylength:int(stack_87_0 = stack_89_0 = stack_AF_0 = stack_B1_0 = stack_D5_0 = stack_180_0 = stack_1D7_0 = stack_23D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3gLf39LQU2sxtaW5ImvM2Q==")))
        
        if (cmpeq:boolean(expr_6C:int, ldc:int(0))) {
            goto(Label_0113)
        }
        
        var_5_162 = expr_6C:int
        var_3_167 = newarray:byte[](byte.class, expr_6C:int)
        var_6_168 = expr_6C:int
        Label_0362:
        
        while (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(4096)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(790641244))
            var_6_168 = add:int(var_6_168:int, ldc:int(-1))
            expr_180 = loadelement:byte(stack_180_0:byte[], var_6_168:int)
            storeelement:byte(var_3_167:byte[], var_6_168:int, xor:int(add:int(or:int(and:int(shl:int(expr_180:byte, xor:int(ldc:int(16467), ldc:int(16471))), ldc:int(-16)), and:int(shr:int(expr_180:byte[expected:int], xor:int(ldc:int(8643), ldc:int(8647))), ldc:int(15))), ldc:int(71)), ldc:int(52)))
            
            if (cmpne:boolean(var_6_168:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_89_0 = stack_87_0 = stack_AF_0 = stack_B1_0 = stack_D5_0 = stack_180_0 = stack_1D7_0 = stack_23D_0 = var_3_167:byte[]
            goto(Label_0113)
        }
        
        Label_0542:
        
        while (cmpne:boolean(and:int(var_0_22A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_233 = and:int(var_0_22A:int, ldc:int(2080096186))
            var_6_168 = add:int(var_6_168:int, ldc:int(-1))
            expr_23D = loadelement:byte(stack_23D_0:byte[], var_6_168:int)
            
            if (cmpge:boolean(add:int(add:int(var_6_168:int, ldc:int(6)), neg:int(var_5_162:int)), ldc:int(0))) {
                var_0_233 = and:int(var_0_233:int, ldc:int(-9977966))
                stack_26D_2 = add:byte(expr_23D:byte, ldc:byte(6))
            }
            else {
                stack_26D_2 = add:byte(expr_23D:byte, loadelement:byte(var_3_167:byte[], add:int(var_6_168:int, ldc:int(6))))
            }
            
            var_0_22A = and:int(var_0_233:int, ldc:int(-71615618))
            storeelement:byte(var_3_167:byte[], var_6_168:int, stack_26D_2:byte)
            
            if (cmpne:boolean(var_6_168:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_89_0 = stack_87_0 = stack_AF_0 = stack_B1_0 = stack_D5_0 = stack_180_0 = stack_1D7_0 = stack_23D_0 = var_3_167:byte[]
            goto(Label_0182)
        }
        
        var_0_22A = and:int(var_0_22A:int, ldc:int(1140527227))
        goto(Label_0362)
        Label_0113:
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0182)
        }
        
        if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(8)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(-806832546))
            var_2_87 = stack_87_0:byte[]
            expr_8B = add:int(arraylength:int(stack_89_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_8B:int, ldc:int(0))) {
                var_3_1C5 = newarray:byte[](byte.class, expr_8B:int)
                var_6_1C6 = expr_8B:int
                
                loop {
                    var_0_22A = and:int(var_0_22A:int, ldc:int(1529309659))
                    var_6_1C6 = add:int(var_6_1C6:int, ldc:int(-1))
                    storeelement:byte(var_3_1C5:byte[], var_6_1C6:int, add:int(shl:int(loadelement:byte(stack_1D7_0:byte[], var_6_1C6:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_87:byte[], add:int(var_6_1C6:int, xor:int(ldc:int(4138), ldc:int(4139)))), ldc:int(4)), xor:int(ldc:int(-28668), ldc:int(-28661)))))
                    
                    if (cmpne:boolean(var_6_1C6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_89_0 = stack_87_0 = stack_AF_0 = stack_B1_0 = stack_D5_0 = stack_180_0 = stack_1D7_0 = stack_23D_0 = var_3_1C5:byte[]
            }
        }
        
        Label_0144:
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22A:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_22A = and:int(var_0_22A:int, ldc:int(-96562178))
                goto(Label_0113)
            }
            
            var_0_22A = and:int(var_0_22A:int, ldc:int(-274599780))
            expr_B1 = arraylength:int(stack_B1_0:byte[])
            
            if (cmpne:boolean(expr_B1:int, ldc:int(0))) {
                var_5_162 = expr_B1:int
                var_3_167 = newarray:byte[](byte.class, expr_B1:int)
                var_6_168 = expr_B1:int
                goto(Label_0542)
            }
        }
        
        Label_0182:
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_22A = and:int(var_0_22A:int, ldc:int(5734225))
            goto(Label_0144)
        }
        
        if (cmpne:boolean(and:int(var_0_22A:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_E1 = initobject:String(String::<init>, stack_D5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_E9 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-27584), ldc:int(-27582)))
            expr_F3 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16552), ldc:int(16554)))
            storeelement:String(expr_F3:String[], and:int(ldc:int(3020), ldc:int(-7117)), invokevirtual:String[expected:String](String::substring, var_3_E1:String, and:int(ldc:int(-32749), ldc:int(29676)), xor:int(ldc:int(-32634), ldc:int(-32630))))
            storeelement:String(expr_E9:String[], xor:int(ldc:int(2181), ldc:int(2180)), invokevirtual:String[expected:String](String::substring, var_3_E1:String, xor:int(ldc:int(25089), ldc:int(25101)), and:int(ldc:int(1805), ldc:int(2061))))
            putstatic:String[](\ub7dc\u64f2\u385b\ud171\u760c::\u6cfe\u34df\u6b5f\u7c6b\u5bc4\u2dcc, expr_F3:String[])
            var_4_141 = invokevirtual:byte[](String::getBytes, loadelement:String[expected:String](expr_E9:String[], xor:int(ldc:int(27648), ldc:int(27649))), getstatic:Charset(Charsets::UTF_8))
            invokevirtual:ByteBuffer(ByteBuffer::put, putstatic:ByteBuffer(\ub7dc\u64f2\u385b\ud171\u760c::\uae5d\uc3e3\ube23\u7ce1\u4c04\u4975, invokestatic:ByteBuffer(ByteBuffer::allocateDirect, arraylength:int(var_4_141:byte[]))), var_4_141:byte[])
            invokevirtual:Buffer(Buffer::flip, getstatic:ByteBuffer[expected:Buffer](\ub7dc\u64f2\u385b\ud171\u760c::\uae5d\uc3e3\ube23\u7ce1\u4c04\u4975))
            return:void()
        }
        
        goto(Label_0113)
    }
    
    public void \ud51e\u120d\uf9c5\u59ec\u7bad\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(-1735009807), ldc:int(-1096849201))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub7dc\u64f2\u385b\ud171\u760c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-2062030758))
        }
        else {
            var_3_654 = and:int(var_3_654:int, ldc:int(-1514709267))
            var_5_8A = and:int(ldc:int(-5613), ldc:int(5516))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11077), ldc:int(10564)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_654:int, ldc:int(-627344411))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, and:int(ldc:int(16489), ldc:int(1431)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_E2:int, ldc:int(-522363963))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(23297), ldc:int(65)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-606433301))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1498670398))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1261344281))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0562)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2054715635))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1436536382))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-222325031))
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1936030787))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1968115756))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-457605661))
                        var_11_F3 = and:int(ldc:int(-1989), ldc:int(1984))
                        goto(Label_1486)
                    }
                    
                    Label_0562:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-260621979))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1148262529))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(758442112))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1288565692))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-359178686))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-661164345))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1884171411))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(596863488))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1212724541))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1679629817))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1645822722))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1418804325))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1861767880))
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1443425282))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-889717507))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = xor:int(ldc:int(4400), ldc:int(4401))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(685890292))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1378659446))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1602529944))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1683992312))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(682693000))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(480067629))
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1936571258))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2053537823))
                        var_11_F3 = and:int(ldc:int(26160), ldc:int(-28465))
                    }
                    
                    Label_1100:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2033010119))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1160078215))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-414856967))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1747362581))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-700673504))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-891987517))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1727849593))
                            goto(Label_1100)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1570730847))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(38677910))
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1884307419))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-944673841))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1005372775))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1950866829))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1666304597))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1320621679))
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-771752491))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-665714608))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1344164819))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(861900168))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(737442723))
                        goto(Label_0562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1082800365))
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1617700377))
                        var_17_65F = add:int(var_16_121:int, xor:int(ldc:int(2124), ldc:int(2125)))
                        looporswitchbreak()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-844032838))
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(-1277600053))
                
                if (cmple:boolean(var_5_8A = var_17_65F:int, sub:int(var_6_91:int, xor:int(ldc:int(6528), ldc:int(6529))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(116372339))
            goto(Label_0108)
        }
    }
}
